public class IfcSectionedSpine : IfcGeometricRepresentationItem
{
    public IfcCompositeCurve SpineCurve { get; set; }
    public List<IfcProfileDef> CrossSections { get; set; }
    public List<IfcAxis2Placement3D> CrossSectionPositions { get; set; }

    // === WHERE CLAUSES ===
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // SpineCurveDim : SpineCurve.Dim = 3

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
