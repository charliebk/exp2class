public class IfcSweptDiskSolid extends IfcSolidModel {
    public IfcCurve Directrix;
    public IfcPositiveLengthMeasure Radius;
    public IfcPositiveLengthMeasure InnerRadius;
    public IfcParameterValue StartParam;
    public IfcParameterValue EndParam;

    // === EXTENDED BY ===
    // IfcSweptDiskSolidPolygonal

    // === WHERE CLAUSES ===
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
    // DirectrixDim : Directrix.Dim = 3
    // InnerRadiusSize : (NOT EXISTS(InnerRadius)) OR (Radius > InnerRadius)
}
