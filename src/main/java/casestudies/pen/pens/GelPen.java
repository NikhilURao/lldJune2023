package casestudies.pen.pens;

import casestudies.pen.Refil;
import casestudies.pen.writestrategies.WriteStrategy;

import java.sql.Ref;

public class GelPen extends Pen {
    private Refil refil;

    public GelPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {

    }
}
