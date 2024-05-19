package rocket.lab3;

import java.util.Objects;

public abstract class PhysicalObject { //объект здесь будет в виде скалы
    protected final int size;
    protected final Material material;
    protected final Color color;

    public PhysicalObject(int size, Material material, Color color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalObject that = (PhysicalObject) o;
        return size == that.size && material == that.material && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, material, color);
    }

    @Override
    public String toString() {
        return "PhysicalObject{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}
