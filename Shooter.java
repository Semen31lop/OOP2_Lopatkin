package Unit;

public class Shooter extends BaseUnit{

    public Shooter(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed) {
        super(name, hpL, maxHp, lvl, damag, maxDamag, armor, speed);
        
    }
   
    public String toString() {
        
        return name;
    }
    @Override
    public String getInfo() {
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s,",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed );
    }
    @Override
    public void spep() {
       
        throw new UnsupportedOperationException("Unimplemented method 'spep'");
    }



    void healing(){

    }
    void protection(){

    }
    void attack(){
    }

}
    
