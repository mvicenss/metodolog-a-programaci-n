// State interface
interface State {
    void pressPlay(MediaPlayer player); //Method that will make the state change
}

// Concrete States
class PlayingState implements State {
    @Override
    //If the current state is Playing, the state changes to a Paused one
    public void pressPlay(MediaPlayer player) {
        System.out.println("Pausing music...");
        player.setState(new PausedState()); //Updating reference
    }
}

class PausedState implements State {
    @Override
    //If current state
    public void pressPlay(MediaPlayer player) {
        System.out.println("Playing music...");
        player.setState(new PlayingState());
    }
}

// Context --
class MediaPlayer {
    private State state; //Instance of the current state (done via State -- Polymorphism)

    public MediaPlayer() {
        state = new PausedState(); // initial state (music is paused)
    }

    public void setState(State state) {
        this.state = state; //Update state of referenced obj.
    }

    //Main will call this method
    public void pressPlay() {
        state.pressPlay(this); //depending on the class of "state" one method or another will be called
    }
}



