public class Animal
{

    private String family ;
    private String name ;
    private int age ;
    private boolean isMammal ;

    public Animal ( String family , String name ,int age , boolean isMammal )
    {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getFamily()
    {
        return family ;
    }
    public String getName()
    {
        return name ;
    }
    public int getage()
    {
        return age ;
    }

    public boolean isMammal()
    {
        return isMammal;
    }
    public void setName(String name)
    {
        if (name.length() == 0 )
        {
            System.out.print("L'âge d'un animal ne peut pas être négatif.");
        }
        this.name = name;
    }
    public void setAge(int age)
    {
        if (age < 0)
        {
            System.out.print("L'âge d'un animal ne peut pas être négatif.");
        }
        this.age = age;
    }


}

        // Autres méthodes pour gérer le refuge (par exemple, getAnimals, removeAnimal, etc.)