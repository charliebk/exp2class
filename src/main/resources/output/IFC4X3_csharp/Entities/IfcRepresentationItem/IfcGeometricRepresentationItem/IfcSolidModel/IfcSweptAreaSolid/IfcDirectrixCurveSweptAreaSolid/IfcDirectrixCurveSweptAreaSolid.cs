public class IfcDirectrixCurveSweptAreaSolid : IfcSweptAreaSolid
{
    public IfcCurve Directrix { get; set; }
    public IfcCurveMeasureSelect StartParam { get; set; }
    public IfcCurveMeasureSelect EndParam { get; set; }

    // === EXTENDED BY ===
    // IfcFixedReferenceSweptAreaSolid
    // IfcSurfaceCurveSweptAreaSolid

    // === WHERE CLAUSES ===
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
}
