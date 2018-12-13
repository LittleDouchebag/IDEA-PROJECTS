import java.util.ArrayList;

public class TestEdible {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new dog());
        objects.add(new pig());
        objects.add(new apple());
        objects.add(new orange());
        for (int i=0;i<objects.size();i++){
            if (objects.get(i) instanceof Edible)
                System.out.println(((Edible) objects.get(i)).howToEat());
            if (objects.get(i) instanceof animal)
                System.out.println(((animal) objects.get(i)).sound());
            if (objects.get(i) instanceof fruits)
                System.out.println(((fruits) objects.get(i)).color());
        }
        System.out.println(animal.animalCount);
    }
}
interface Edible{
    public String howToEat();
}

abstract class animal{
    protected static int animalCount=0;
    abstract public String sound();
}

class dog extends animal implements Edible{
    public dog(){
        animalCount++;
    }
    @Override
    public String sound(){
        return "oaf!oaf!";
    }
    @Override
    public String howToEat(){
        return "dog meat hot pot!";
    }
}

class pig extends animal implements Edible{
    public pig(){
        animalCount++;
    }
    @Override
    public String sound(){
        return "puwpuw!";
    }
    @Override
    public String howToEat(){
        return "bacon!";
    }
}

abstract class fruits{
    abstract public String color();
}

class apple extends fruits implements Edible{
    @Override
    public String color(){
        return "red!";
    }
    @Override
    public String howToEat(){
        return "apple pie!";
    }
}

class orange extends fruits implements Edible{
    @Override
    public String color(){
        return "orange!";
    }

    @Override
    public String howToEat(){
        return "orange juice!";
    }
}