public class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity {
    public SET [1:?] OF IfcPhysicalQuantity HasQuantities;
    public IfcLabel Discrimination;
    public IfcLabel Quality;
    public IfcLabel Usage;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* HasQuantities | SELF :=: temp)) = 0
    // UniqueQuantityNames : IfcUniqueQuantityNames(HasQuantities)
}
