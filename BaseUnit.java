package Unit;


public abstract class BaseUnit implements GameInterface {
    protected int hpL , maxHp, lvl ,damag ,maxDamag,armor,speed;
    protected String name;

    public BaseUnit(String name, int hpL , int maxHp,int lvl, int damag, int maxDamag , int armor, int speed){
        this.armor = armor;
        this.damag= damag;
        this.lvl=lvl;
        this.maxDamag=maxDamag;
        this.maxHp=maxHp;
        this.name=name;
        this.hpL=hpL;
        this.speed=speed;

    }

    
   
    
    public String getInfo (){
        return String.format("-- %s -- %s[%d/%d], damag: %d --",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed );
            
    }    
    @Override
    public void spep() {
        
        
    }

}
