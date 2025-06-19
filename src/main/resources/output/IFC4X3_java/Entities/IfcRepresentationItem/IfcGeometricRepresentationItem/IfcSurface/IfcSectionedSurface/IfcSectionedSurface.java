public class IfcSectionedSurface extends IfcSurface {
    public IfcCurve Directrix;
    public List<IfcAxis2PlacementLinear> CrossSectionPositions;
    public List<IfcProfileDef> CrossSections;

    // === WHERE CLAUSES ===
    // AreaProfileTypes : SIZEOF(QUERY(temp <* CrossSections | temp.ProfileType = IfcProfileTypeEnum.CURVE)) <> 0
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // DirectrixIs3D : Directrix.Dim = 3
    // NoOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLateral) OR EXISTS(temp.Location.OffsetVertical) OR EXISTS(temp.Location.OffsetLongitudinal))) = 0
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
}
