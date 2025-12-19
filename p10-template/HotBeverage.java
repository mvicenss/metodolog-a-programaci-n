//abstract class, defines the "template method" and the steps of the process.

public abstract class HotBeverage { 

    //template method -- All subclasses must implement
    //we mark it as final so subclasses cannot change the structure
    public final void prepareRecipe() { 
        boilWater();          //common step
        brew();               //variable step(abstract)
        pourInCup();         //common step
        if (wantsCondiments()) { // hook (optional)
            addCondiments();     //variable step (abstract)
    }
}

//common steps (shared) -- Every class will have to execute this method
private void boilWater() {
    System.out.println("Boiling water");
}
private void pourInCup() {
    System.out.println("Pouring into cup");
}

    //variable steps (to be implemented by subclasses)
    protected abstract void addCondiments();
    protected abstract void brew();

    protected boolean wantsCondiments() { return true; }
}

