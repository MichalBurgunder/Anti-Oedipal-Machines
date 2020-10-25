package AntiOedipalMachines;

/**
 * Bottom line of macroscopic neuronal activity. As far as I rememeber (I read
 * Anti-Oedipus some 3 years ago), there are several machines: a Desiring
 * Machine & Social Machine In Thousand Plateaus, they talk about the War
 * machine, but that's a TODO for now
 */
public class Machine {
    int productivity; // lets limit this number from 0-100. We can always go higher
    int products;

    public int start() {
        // we can let a thread continually generate product
        return 0;
    };

    public int assimilateProduct() {
        // need to somehow assimilate it into higher level subjective spaces
        return 0;
    }

    public void run() {

    }
}
