public class IfcCompositeCurveSegment : IfcSegment
{
    public IfcBoolean SameSense { get; set; }
    public IfcCurve ParentCurve { get; set; }

    // === EXTENDED BY ===
    // IfcReparametrisedCompositeCurveSegment

    // === WHERE CLAUSES ===
    // ParentIsBoundedCurve : ('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(ParentCurve))
}
