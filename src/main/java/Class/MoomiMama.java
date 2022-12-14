package Class;

import Interface.ActionMoomimama;

public class MoomiMama extends AbstractClass implements ActionMoomimama {
    public MoomiMama(String name) {
        super(name);
    }
    @Override
    public void cover() {
        class Location{
            final String name;

            public Location(String mean) {
                this.name = mean;
            }

            public String getName() {
                return name;
            }
        }
        Location location = new Location("зал");
        System.out.print(" " + "как" + " " + this.getName() + " " + "накрывает на стол" + " " + "к обеду" +
                " " + "в" + " " + location.getName() + ".");
    }
}
