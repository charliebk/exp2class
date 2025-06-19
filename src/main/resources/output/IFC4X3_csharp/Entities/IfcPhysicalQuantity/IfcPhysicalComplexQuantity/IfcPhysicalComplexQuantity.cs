public class IfcPhysicalComplexQuantity : IfcPhysicalQuantity
{
    public SET [1:?] OF IfcPhysicalQuantity HasQuantities { get; set; }
    public IfcLabel Discrimination { get; set; }
    public IfcLabel Quality { get; set; }
    public IfcLabel Usage { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* HasQuantities | SELF :=: temp)) = 0
    // UniqueQuantityNames : IfcUniqueQuantityNames(HasQuantities)
}
