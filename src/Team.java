import java.util.Arrays;

public class Team {

        public String nameComand;
        public Participant[] participant;

    public Team(String nameComand, Participant... participant) {
        this.nameComand = nameComand;
        this.participant = participant;
    }

    public Participant[] getParticipant() {
        return participant;
    }

    public void showInfoAll(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("Team name: " + nameComand);
        System.out.println(Arrays.toString(participant));
    }

    public void showInfoPassed(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("Team name: " + nameComand);
        for (int i = 0; i < participant.length; i++) {
            if(participant[i].isPassed()){
                System.out.println(participant[i]);
            }

        }

    }

}

//1. Разобраться с имеющимся кодом (написанный во время урока)
//        2. Создать класс Team, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
//        3. Создать класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить команду пройти всю полосу;
//        То есть в итоге должно быть:
//
//public static void main(String[] args) {
//        Course c = new Course(...); // Создаем полосу препятствий
//        Team team = new Team(...); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
//        team.showResults(); // Показываем результаты
//        }