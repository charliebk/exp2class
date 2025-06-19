public class IfcSectionedSolidHorizontal extends IfcSectionedSolid {
    public List<IfcAxis2PlacementLinear> CrossSectionPositions;

    // === WHERE CLAUSES ===
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // NoLongitudinalOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLongitudinal))) = 0
}
