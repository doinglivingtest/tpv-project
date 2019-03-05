package upc.qa.tpv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestVenta {

            List<Codigo> codes = new List<Codigo>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<Codigo> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(Codigo codigo) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends Codigo> c) {
                    return false;
                }

                @Override
                public boolean addAll(int index, Collection<? extends Codigo> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public Codigo get(int index) {
                    return null;
                }

                @Override
                public Codigo set(int index, Codigo element) {
                    return null;
                }

                @Override
                public void add(int index, Codigo element) {

                }

                @Override
                public Codigo remove(int index) {
                    return null;
                }

                @Override
                public int indexOf(Object o) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object o) {
                    return 0;
                }

                @Override
                public ListIterator<Codigo> listIterator() {
                    return null;
                }

                @Override
                public ListIterator<Codigo> listIterator(int index) {
                    return null;
                }

                @Override
                public List<Codigo> subList(int fromIndex, int toIndex) {
                    return null;
                }
            };
            Venta venta;
            long lastCode = 777852454;
            @Before
            public void init(){
                venta = new Venta();
                venta.addCodigo(new Codigo(899898989));
                venta.addCodigo(new Codigo(899898232));
                venta.addCodigo(new Codigo(899844432));
            }

            @Test
            public void testAddCode(){
                venta.addCodigo(new Codigo(lastCode));

                assertEquals(lastCode, venta.returnVentas().get(3).getCode());
            }


}
