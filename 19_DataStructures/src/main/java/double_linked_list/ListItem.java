package double_linked_list;

import lombok.Data;

@Data
public class ListItem
{
    private String data;
    private ListItem prev;
    private ListItem next;

    public ListItem(String data) {
        this.data = data;
    }

}