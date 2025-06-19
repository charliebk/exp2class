public class IfcSectionedSurface : IfcSurface
{
    public IfcCurve Directrix { get; set; }
    public List<IfcAxis2PlacementLinear> CrossSectionPositions { get; set; }
    public List<IfcProfileDef> CrossSections { get; set; }

    // === WHERE CLAUSES ===
    // AreaProfileTypes : SIZEOF(QUERY(temp <* CrossSections | temp.ProfileType = IfcProfileTypeEnum.CURVE)) <> 0
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // DirectrixIs3D : Directrix.Dim = 3
    // NoOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLateral) OR EXISTS(temp.Location.OffsetVertical) OR EXISTS(temp.Location.OffsetLongitudinal))) = 0
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
}
