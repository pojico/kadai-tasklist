package validators;


import java.util.ArrayList;
import java.util.List;

public class TaskValidator {

    //バリデーションを実行する
    public static List<String> validate(models.Task t){
        List<String> errors = new ArrayList<String>();

        String content_error = validateContent(t.getContent());
        if(!content_error.equals("")){
            errors.add(content_error);
        }
        return errors;
    }

    //タスクの入力チェック
    private static String validateContent(String content){
        if(content == null || content.equals("")){
            return "タスクを入力してください。";
        }
        return "";
    }

}
