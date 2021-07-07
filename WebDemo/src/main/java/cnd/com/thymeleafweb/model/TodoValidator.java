package cnd.com.thymeleafweb.model;

import org.thymeleaf.util.StringUtils;

import java.util.Optional;

public class TodoValidator {

    /**
     * Kiểm tra một obj Todo có hợp lệ không
     *
     * @return
     * @Param todo
     */
    public boolean isValid(Todo todo) {
        return Optional.of(todo)
                .filter(t -> !StringUtils.isEmpty(t.getTitle())) //kiểm tra title khác rỗng
                .filter(t -> !StringUtils.isEmpty(t.getDetail())) //kiểm tra detail khác rỗng
                .isPresent(); //trả về true nếu hợp lệ, ngược lại false
    }
}
