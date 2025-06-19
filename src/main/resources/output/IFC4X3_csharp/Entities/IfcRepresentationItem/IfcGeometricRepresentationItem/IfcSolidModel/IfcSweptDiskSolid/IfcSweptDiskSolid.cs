public class IfcSweptDiskSolid : IfcSolidModel
{
    public IfcCurve Directrix { get; set; }
    public IfcPositiveLengthMeasure Radius { get; set; }
    public IfcPositiveLengthMeasure InnerRadius { get; set; }
    public IfcParameterValue StartParam { get; set; }
    public IfcParameterValue EndParam { get; set; }

    // === EXTENDED BY ===
    // IfcSweptDiskSolidPolygonal

    // === WHERE CLAUSES ===
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
    // DirectrixDim : Directrix.Dim = 3
    // InnerRadiusSize : (NOT EXISTS(InnerRadius)) OR (Radius > InnerRadius)
}
