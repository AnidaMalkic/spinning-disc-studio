package org.launchcode;

public class CD extends org.launchcode.BaseDisc implements OpticalDisc{
    public CD() {

        super(700, 500);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD disc spins at rate of " + this.getSpinSpeed() + "RPM");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);

    }

    @Override
    public boolean isFull() {
        if (this.readData().length() >= this.getStorageCapacity())
            return true;

      else return false;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
