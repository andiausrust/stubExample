package andi.com.mockito;

import andi.com.mockito.data.api.TodoServiceStub;
import com.andi.business.TodoBusinessImpl;
import com.andi.data.api.TodoService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void test(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(
                todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2, filteredTodos.size());
    }
}
