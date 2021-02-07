package rogue.model.items.weapons;

/**
 * A decorator to increase the weapon accuracy.
 */
public class IncreaseAccuracy extends WeaponDecorator {

    private static final int ADDITIONAL_ACCURACY = 2;

    public IncreaseAccuracy(final Weapon weapon) {
        super(weapon);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPrecision() {
        return super.getPrecision() + ADDITIONAL_ACCURACY;
    }

}
