package rocket.lab3.exception;

import javax.crypto.spec.PSource;

public class BadSpeakException extends Exception{
   private String speaker;
   private String example; //поля заполнены данными где-то в мечтах
   private  String pattern="Какое там горе! Одна комедия! Никто его не обидит, не волнуйся! Пошли!";
   private String badWord;
   public BadSpeakException(){}//пустой конструктор, чтобы не выпендривался
    public BadSpeakException(String speaker, String badWord){
        super("Ошибочка в словах");
        this.speaker = speaker;
        this.badWord = badWord;
    }
    public String getSpeaker() {
        return speaker;
    }
    public void setExample(String example){this.example=example;
        System.out.println(example);
    }
    public String getBadWords() {
        return badWord;
    }
    public  boolean equals(){return example!=pattern;} //здесь он сравнивается (сравнивает значение поля example с указанным шаблоном pattern.)
    public void setPattern(String pattern){this.pattern=pattern;}

    @Override
    public String getMessage() {
        return "Ошибочка в словах: " + speaker + " сказал" + String.join(",", badWord);
    }
}
