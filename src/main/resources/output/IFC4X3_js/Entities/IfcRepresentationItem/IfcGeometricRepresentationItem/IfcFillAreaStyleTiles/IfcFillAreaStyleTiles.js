class IfcFillAreaStyleTiles extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCVECTOR[]} */
        this.TilingPattern = null;
        /** @type {SET [1:?] OF IFCSTYLEDITEM} */
        this.Tiles = null;
        /** @type {IFCPOSITIVERATIOMEASURE} */
        this.TilingScale = null;
    }
}
