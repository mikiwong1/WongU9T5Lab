import java.util.ArrayList;
public class Cabaret {
    private ArrayList<Performer> performers;
    private String name;

    public Cabaret(String name){
        performers = new ArrayList<Performer>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer performer){
        if(performers.indexOf(performer) == -1){
            performers.add(performer);
            return true;
        } else {
            return false;
        }
    }

    public boolean removePerformer(Performer performer){
        if(performers.indexOf(performer) != -1){
            performers.remove(performers.indexOf(performer));
            return true;
        }
            return false;
    }

    public double averagePerfomerAge(){
        double sum = 0;
        for (Performer performer : performers){
            sum += performer.getAge();
        }
        sum = sum / performers.size();
        return sum;
    }

    public ArrayList<Performer> performersOverAge(int age){
        ArrayList<Performer> list = new ArrayList<Performer>();
        for (Performer performer : performers){
            if(performer.getAge() >= age){
                list.add(performer);
            }
        }
        return list;
    }

    public void groupRehearsal(){
        for (Performer performer : performers){
            System.out.println("REHEARSAL CALL! " + performer.getName());

            if(performer instanceof Comedian){
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow(){
        for (Performer performer : performers){
            System.out.println("Welcome to the cabaret! Next act up… " + performer.getName());

            if(performer instanceof Dancer){
                Dancer temp = (Dancer) performer;
                temp.pirouette(2);
            } else {
                performer.perform();
            }
        }
    }
}
