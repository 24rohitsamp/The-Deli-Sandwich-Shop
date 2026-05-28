package com.pluralsight;

public abstract class PremiumTopping extends Topping {

    private boolean isExtra;

    public PremiumTopping(String name, boolean isExtra) {
        super(name);
        this.isExtra = isExtra;
    }
// add some comments to this page
    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        this.isExtra = extra;
    }

    @Override
    public String toString() {
        return getName() + (isExtra ? " (extra)" : "");
    }
}