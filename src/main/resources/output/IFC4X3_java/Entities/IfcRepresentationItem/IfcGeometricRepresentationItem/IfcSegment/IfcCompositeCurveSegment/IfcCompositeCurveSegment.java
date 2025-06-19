public class IfcCompositeCurveSegment extends IfcSegment {
    public IfcBoolean SameSense;
    public IfcCurve ParentCurve;

    // === EXTENDED BY ===
    // IfcReparametrisedCompositeCurveSegment

    // === WHERE CLAUSES ===
    // ParentIsBoundedCurve : ('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(ParentCurve))
}
