package rocket.lab3.human;

public enum HumanSense {
    NORMAL("нормич"),
    RELUCTANTLY(" неохотно"),
    AGRESS("aгрессивно"),
    CRY(" плачет"),
    SAD(" грустный"),
    GRIEF(" горюет"),
  //  Clear(),
    PITIFULLY("ужасно жалко");

    private final String state; //приватное поле state

    HumanSense(String state) {
        this.state = state;
    } // Конструктор для инициализации поля
    // Метод для доступа к полям
    public String getState() {
        return state;
    } //метод, возвращает значение поля state.

 //HumanSense(){
      //  this.state = "";
// }



}
