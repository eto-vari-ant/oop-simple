public class HotDogs {
    public final boolean bread = true;
    private boolean cheese;
    private boolean mayonnaise;
    private boolean spicySause;
    private boolean ketchup;
    private boolean mustard;
    private boolean sausage;
    private boolean cucumber;
    private boolean tomato;
    private boolean pepper;
    private boolean koreanCarrot;
    private boolean potato;
    public boolean isCheese() {
        return cheese;
    }
    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }
    public boolean isMayonnaise() {
        return mayonnaise;
    }
    public void setMayonnaise(boolean mayonnaise) {
        this.mayonnaise = mayonnaise;
    }
    public boolean isSpicySause() {
        return spicySause;
    }
    public void setSpicySause(boolean spicySause) {
        this.spicySause = spicySause;
    }
    public boolean isKetchup() {
        return ketchup;
    }
    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }
    public boolean isMustard() {
        return mustard;
    }
    public void setMustard(boolean mustard) {
        this.mustard = mustard;
    }
    public boolean isSausage() {
        return sausage;
    }
    public void setSausage(boolean sausage) {
        this.sausage = sausage;
    }
    public boolean isCucumber() {
        return cucumber;
    }
    public void setCucumber(boolean cucumber) {
        this.cucumber = cucumber;
    }
    public boolean isTomato() {
        return tomato;
    }
    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }
    public boolean isPepper() {
        return pepper;
    }
    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }
    public boolean isKoreanCarrot() {
        return koreanCarrot;
    }
    public void setKoreanCarrot(boolean koreanCarrot) {
        this.koreanCarrot = koreanCarrot;
    }
    public boolean isPotato() {
        return potato;
    }
    public void setPotato(boolean potato) {
        this.potato = potato;
    }
    public boolean isBread() {
        return bread;
    }
    public HotDogs() {
        super();
        this.cheese = false;
        this.mayonnaise = false;
        this.spicySause = false;
        this.ketchup = false;
        this.mustard = false;
        this.sausage = false;
        this.cucumber = false;
        this.tomato = false;
        this.pepper = false;
        this.koreanCarrot = false;
        this.potato = false;
    }
}
