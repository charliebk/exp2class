public class IfcRelContainedInSpatialStructure extends IfcRelConnects {
    public SET [1:?] OF IfcProduct RelatedElements;
    public IfcSpatialElement RelatingStructure;

    // === WHERE CLAUSES ===
    // WR31 : SIZEOF(QUERY(temp <* RelatedElements | 'IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp))) = 0
}
