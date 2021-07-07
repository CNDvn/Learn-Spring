package cnd.com.thymeleafweb.controller;

import cnd.com.thymeleafweb.model.Todo;
import cnd.com.thymeleafweb.service.TodoService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    /*
     @RequestParam dùng để đánh dấu một biến là request param trong request gửi lên server.
     Nó sẽ gán dữ liệu của param-name tương ứng vào biến
     */
    @GetMapping("/listTodo")
    public String index(
            Model model,
            @RequestParam(value = "limit", required = false) Integer limit
    ){
        //trả về đối tượng Todo
        model.addAttribute("todoList", todoService.findAll(limit));
        //trả về template "listTodo.html"
        return "listTodo";
    }
    @GetMapping("/addTodo")
    public String addTodo(Model model){
        model.addAttribute("todo",new Todo());
        return "addTodo";
    }
    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo){
        return Optional.ofNullable(todoService.add(todo))
                .map(t -> "success") //Trả về success nếu save thành công
                .orElse("failed"); //trả về failed nếu save không thành công
    }
}
