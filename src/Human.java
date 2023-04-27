public class Human implements Comparable<Human> {

    public String last_name, first_name, second_name;

    public Human(String last_name, String first_name, String second_name) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.second_name = second_name;
    }

    public int compareTo(Human human) {
        int check = this.last_name.compareTo(human.last_name);
        if (check == 0) {
            check = this.first_name.compareTo(human.first_name);
            if (check == 0) {
                check = this.second_name.compareTo(human.second_name);
            }
        }
        if (check > 0)
            check = 1;
        else if (check < 0)
            check = -1;
        return check;
    }

    @Override
    public String toString() {
        return last_name + " " + first_name + " " + second_name;
    }
}