import org.junit.Assert.assertEquals
import org.junit.Test


class MainTest{
    fun Test0(){
        var e : MutableList<Pair<Int, Int>> = MutableList<Pair<Int, Int>>();
        e.add(Pair(1,2));
        e.add(Pair(1,3));
        var q : MutableList<Pair<Int, Int>> = MutableList<Pair<Int, Int>>();
        q.add(2,3);
        Answer(q);
    }

}
