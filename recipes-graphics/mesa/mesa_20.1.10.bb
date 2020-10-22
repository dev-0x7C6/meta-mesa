require ${BPN}.inc

SRC_URI[sha256sum] = "b1dba69910adac9fcb4cbdfd7833d99a4a8c75b91f3d2e97f0fd0a3cd8c6ee9f"

SRC_URI_append = "file://0002-meson.build-make-TLS-ELF-optional.patch \
    file://0003-Allow-enable-DRI-without-DRI-drivers.patch \
"