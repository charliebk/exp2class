public class IfcTextLiteralWithExtent : IfcTextLiteral
{
    public IfcPlanarExtent Extent { get; set; }
    public IfcBoxAlignment BoxAlignment { get; set; }

    // === WHERE CLAUSES ===
    // WR31 : NOT('IFC4X3_DEV_73740fe4.IFCPLANARBOX' IN TYPEOF(Extent))
}
