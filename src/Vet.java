import java.util.ArrayList;

public class Vet {

    private ArrayList<Animal> clients;
    private String name;

    public Vet(String name){
        clients = new ArrayList<Animal>();
        this.name = name;
    }

    public void addClient(Animal potentialClient){
        if(clients.indexOf(potentialClient) == -1){
            System.out.println("Welcome to " + name + "'s office, " + potentialClient.getName() + "!");
            clients.add(potentialClient);
        } else {
            System.out.println(potentialClient.getName() + " is already a client of " + name);
        }
    }
}
