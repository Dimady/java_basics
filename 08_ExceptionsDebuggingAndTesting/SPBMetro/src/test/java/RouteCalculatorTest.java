
import core.Line;
import core.Station;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {

    List<Station> twoTransfersRoute;
    List<Station> oneTransfersRoute;
    List<Station> noTransferRoute;

    StationIndex stationIndex;
    RouteCalculator calculator;

    Station baumanskaya;
    Station kyrskaya;
    Station revolycii;
    Station sretenskiy;
    Station chkalovskaya;
    Station rimskaya;
    Station entuziastov;
    Station aviamotornaya;
    Station ilyicha;

    @Override
    public void setUp() throws Exception {

        //Схема тестовой линии
        //[l1]            [l2]            [l3]
        //[l1]-[transfer]-[l2]            [l3]
        //[l1]            [l2]-[transfer]-[l3]

        stationIndex = new StationIndex();

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");

        baumanskaya = new Station("Бауманская", line1);
        kyrskaya = new Station("Курская", line1);
        revolycii = new Station("Площадь Революции", line1);
        sretenskiy = new Station("Сретенский Бульвар", line2);
        chkalovskaya = new Station("Чкаловская", line2);
        rimskaya = new Station("Римская", line2);
        entuziastov = new Station("Шоссе Энтузиастов", line3);
        aviamotornaya = new Station("Авиамоторная", line3);
        ilyicha = new Station("Площадь Ильича", line3);

        Stream.of(line1, line2, line3).forEach(stationIndex::addLine);
        Stream
                .of(baumanskaya, kyrskaya, revolycii, sretenskiy, chkalovskaya, rimskaya, entuziastov, aviamotornaya,
                        ilyicha).peek(s -> s.getLine().addStation(s)).forEach(stationIndex::addStation);
        stationIndex.addConnection(Stream.of(kyrskaya, chkalovskaya).collect(Collectors.toList()));
        stationIndex.addConnection(Stream.of(rimskaya, ilyicha).collect(Collectors.toList()));
        stationIndex.getConnectedStations(kyrskaya);
        stationIndex.getConnectedStations(rimskaya);

        calculator = new RouteCalculator(stationIndex);

        //тестовые маршруты
        noTransferRoute = Stream.of(baumanskaya, kyrskaya, revolycii).collect(Collectors.toList());
        oneTransfersRoute = Stream.of(baumanskaya, kyrskaya, chkalovskaya, sretenskiy)
                .collect(Collectors.toList());
        twoTransfersRoute = Stream
                .of(baumanskaya, kyrskaya, chkalovskaya, rimskaya, ilyicha, aviamotornaya, entuziastov)
                .collect(Collectors.toList());
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(twoTransfersRoute);
        double expected = 17;
        assertEquals(expected, actual);
    }

    public void testGetShortestRoute() {
        List<Station> actualNoTransfer = calculator.getShortestRoute(baumanskaya, revolycii);
        List<Station> actualOneTransfer = calculator.getShortestRoute(baumanskaya, sretenskiy);
        List<Station> actualTwoTransfers = calculator.getShortestRoute(baumanskaya, entuziastov);

        List<Station> expectedNoTransfers = noTransferRoute;
        List<Station> expectedOneTransfers = oneTransfersRoute;
        List<Station> expectedTwoTransfers = twoTransfersRoute;

        assertEquals(actualNoTransfer, expectedNoTransfers);
        assertEquals(actualOneTransfer, expectedOneTransfers);
        assertEquals(actualTwoTransfers, expectedTwoTransfers);
    }
}