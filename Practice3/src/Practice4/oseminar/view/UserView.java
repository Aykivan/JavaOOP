package Practice4.oseminar.view;

import Practice4.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
