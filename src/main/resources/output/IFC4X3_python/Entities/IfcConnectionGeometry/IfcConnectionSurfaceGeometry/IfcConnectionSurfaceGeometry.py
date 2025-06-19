class IfcConnectionSurfaceGeometry(IfcConnectionGeometry):
    def __init__(self):
        self.SurfaceOnRelatingElement: IfcSurfaceOrFaceSurface = None
        self.SurfaceOnRelatedElement: IfcSurfaceOrFaceSurface = None
