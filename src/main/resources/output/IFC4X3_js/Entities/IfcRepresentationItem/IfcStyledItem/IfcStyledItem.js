class IfcStyledItem extends IfcRepresentationItem {
    constructor() {
        /** @type {IFCREPRESENTATIONITEM} */
        this.Item = null;
        /** @type {SET [1:?] OF IFCPRESENTATIONSTYLE} */
        this.Styles = null;
        /** @type {IFCLABEL} */
        this.Name = null;
    }

    // === WHERE CLAUSES ===
    // ApplicableItem : NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(Item))
}
