package andi.com.mockito.data.api;

import com.andi.data.api.TodoService;

import java.util.Arrays;
import java.util.List;

// stub ... dummy implementation of TodoService
public class TodoServiceStub implements TodoService {

    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring",
                "Learn to dance", "dance in spring");
    }
}
