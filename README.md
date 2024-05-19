# Rapport
Det första steget var, likt tidigare, att skapa en fork av projektet på LenaSYS Github. Först ut var att hitta ett externt bibliotek som kan användas, efter några sökningar hittades ett bibliotek som heter _Picasso_ vilket är ett bibliotek som används för bland annat för hantering av bilder. För detta valdes version 2.5.2. Att inkludera detta bibliotek gjorden genom att lägga till det i _dependencies_ i _app/build.gradle_. 

**build.gradle**
```
    ...
    implementation 'com.squareup.picasso:picasso:2.5.2'
    ...
```

Nästa steg var därefter att lägga till en vy för bilder på startskärmen samt uppdatera _AndroidManifest.xml_ för att tillåta tillgång till internet. Detta gjordes likt tidigare med att lägga till en extra rad i filen.

**AndroidManifest.xml**
```
    ...
    <uses-permission android:name="android.permission.INTERNET" />
    ...
```

Sista steget var att använda det externa biblioteket _Picasso_ för att uppdatera/ladda in en bild i vyn. För att göra processen enklare, användes en sida som returnerar slumpmässiga bilder varje gång av en specifierad storlek (Länk: https://picsum.photos/600/900). Med hjälp av lite dokumentation samt kod för att komma åt _ImageView_ kunde man ladda in en bild via _Picasso_. 

**MainActivity.java**
```

    // Get reference to image
    imageView = findViewById(R.id.imageView);
    // Using Picasso, update the image
    Picasso.with(this).load(randomImage).into(imageView);
```

Skärmklipp på huvudskärmen fast med annan slumpmässig bild, _MainActivity_:
![Screenshot_20240519_223426](https://github.com/a20gabpa/mobileapp-programming-external-libraries/assets/102604680/f0cc367f-ecad-423a-8d87-f37170c4f9ee)

Skärmklipp på huvudskärmen fast med annan slumpmässig bild, _MainActivity_: 
![Screenshot_20240519_223556](https://github.com/a20gabpa/mobileapp-programming-external-libraries/assets/102604680/5a8d10ce-d30a-48de-ac30-7f347a2a0558)
