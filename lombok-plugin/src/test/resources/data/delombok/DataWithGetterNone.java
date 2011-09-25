class DataWithGetterNone {
  private int x;
  private int y;
  private final String z;

  @java.beans.ConstructorProperties({"z"})
  @java.lang.SuppressWarnings("all")
  public DataWithGetterNone(final String z) {
    this.z = z;
  }

  @java.lang.SuppressWarnings("all")
  public void setX(final int x) {
    this.x = x;
  }

  @java.lang.SuppressWarnings("all")
  public void setY(final int y) {
    this.y = y;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof DataWithGetterNone)) return false;
    final DataWithGetterNone other = (DataWithGetterNone) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (this.x != other.x) return false;
    if (this.y != other.y) return false;
    if (this.z == null ? other.z != null : !this.z.equals((java.lang.Object) other.z)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  public boolean canEqual(final java.lang.Object other) {
    return other instanceof DataWithGetterNone;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 31;
    int result = 1;
    result = result * PRIME + this.x;
    result = result * PRIME + this.y;
    result = result * PRIME + (this.z == null ? 0 : this.z.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "DataWithGetterNone(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
  }
}