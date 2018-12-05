# Lab 04: Bitmap part 1

## Feature Task
This lab will implement a bitmap transformer Command Line Interface (CLI).  It will read in a bitmap from disk, run one or more color or raster transformations and then write it out to a new file.

## Bitmap Class Description
The bitmap class I made contains five transformations.
1. flipVertically() - flips the image vertically
2. flipHorizontally() - flips the image horizontally
3. addRedBorder() - adds a red border to the image
4. lighten() - lightens the image
5. darken() - darkens the image

It also contains a save() method, which writes out the transformed file to the disk.

## CLI
The Command Line Interface requires three arguements:
1. input file path
2. output file path
3. desired image transformation