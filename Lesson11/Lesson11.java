package Lesson11;
import javax.print.attribute.standard.MediaSize;
import java.util.Objects;

public class Lesson11 {


    public class Name<K, A> {
        private K Kate;
        private A Alan;

        public Name(K Kate, A Alan) {
            this.Kate = Kate;
            this.Alan = Alan;
        }

        public A getAlan() {
            return Alan;
        }

        public void setAlan(A Alan) {
            this.Alan = Alan;
        }

        public K getKate() {
            return Kate;
        }

        public void setSecond(K Kate) {
            this.Kate = Kate;
        }

        public Name copy() {
            return new Name(this.Kate, this.Alan);
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Kate, Alan);
        }

        @Override
        public String toString() {
            return "Name{" +
                    "Kate=" + Kate +
                    ", Alan=" + Alan +
                    '}';
        }
    }
}

