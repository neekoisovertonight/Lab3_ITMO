package creatures.gods;

import creatures.LivingBeing;

public abstract class God extends LivingBeing {
    @Override
    public void exist() {
        System.out.println("Бог создан.");
    }
}
