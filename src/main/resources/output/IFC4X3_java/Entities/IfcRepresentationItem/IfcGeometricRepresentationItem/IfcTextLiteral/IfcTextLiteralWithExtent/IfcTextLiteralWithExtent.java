public class IfcTextLiteralWithExtent extends IfcTextLiteral {
    public IfcPlanarExtent Extent;
    public IfcBoxAlignment BoxAlignment;

    // === WHERE CLAUSES ===
    // WR31 : NOT('IFC4X3_DEV_73740fe4.IFCPLANARBOX' IN TYPEOF(Extent))
}
