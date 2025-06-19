public class IfcConnectionPointGeometry : IfcConnectionGeometry
{
    public IfcPointOrVertexPoint PointOnRelatingElement { get; set; }
    public IfcPointOrVertexPoint PointOnRelatedElement { get; set; }

    // === EXTENDED BY ===
    // IfcConnectionPointEccentricity
}
