public class NoteMethods extends Methods implements Menuable{

    int noteNumber = 1;
    Notes[] notes = new Notes[5];
    int noteCount;
    int noteSearchNumber;

    public void createNote() {
        String noteName;
        while (true) {
            System.out.println("Введите название заметки:");
            noteName = scanner.nextLine();
            if (noteName.replaceAll(" ", "").equals("")) {
                System.out.println("Поле не должно быть пустым");
            } else {
                break;
            }
        }

        String noteBody;
        while (true) {
            System.out.println("Введите текст заметки:");
            noteBody = scanner.nextLine();
            if (noteBody.replaceAll(" ", "").equals("")) {
                System.out.println("Поле не должно быть пустым");
            } else {
                break;
            }
        }

        System.out.println("Выберете тип заметки:\n1. Рабочая заметка\n2. Домашняя заметка");
        String noteType;

        Notes note;

        while (true) {
            noteType = scanner.nextLine();
            if (noteType.equals("1")) {
                noteType = "Рабочая заметка";
                note = new WorkingNotes<String>(noteName, noteBody, noteType, noteNumber, currentUser.toString());
                break;
            } else if (noteType.equals("2")) {
                noteType = "Домашняя заметка";
                note = new WorkingNotes<String>(noteName, noteBody, noteType, noteNumber, currentUser.toString());
                break;
            } else {
                System.out.println("Введите корректный тип заметки");
            }
        }

        if (noteNumber <= 5) {
            notes[noteNumber - 1] = note;
            System.out.println("Заметка №" + noteNumber + " создана.\n");
            noteNumber++;
        } else {
            System.out.println("Лимит заметок превышен! \n");
        }
    }

    public void searchNote() {

        System.out.println("Введите название или тип заметки полностью или частично:");
        noteCount = 0;
        String searchInput = scanner.nextLine();

        for (Notes note: notes) {
            if (note != null) {
                if (note.noteName.toLowerCase().contains(searchInput.toLowerCase()) | note.noteType.toLowerCase().contains(searchInput.toLowerCase())) {
                    System.out.println(note);
                    noteSearchNumber = note.noteNumber;
                    noteCount++;
                }
            }
        }

        if (noteCount == 0) {
            System.out.println("Заметок по заданным параметрам не найдено\n");
            return;
        }

        actionsNote();
    }

    public void actionsNote() {

        if (noteCount > 1) {
            System.out.println("Выберите номер заметки, с которой будете работать:");
            while (true) {
                try {
                    noteSearchNumber = Integer.parseInt(scanner.nextLine());
                    if (notes[noteSearchNumber - 1] == null) {
                        System.out.println("Введите корректный номер заметки");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Введите корректный номер заметки");
                }
            }
            System.out.println(notes[noteSearchNumber - 1]);
        }

        if (currentUser.equals(Users.Administrator) | currentUser.equals(Users.Moderator)) {
            while (true) {
                System.out.println("Выберите действие с заметкой:");
                System.out.println("1. Изменить название заметки");
                System.out.println("2. Изменить слово заметки");
                System.out.println("3. Изменить тело заметки");
                System.out.println("4. Вывести автора заметки");
                System.out.println("5. Удалить заметку");
                System.out.println("6. Назад");

                String input = "";

                switch (scanner.nextLine()) {
                    case "1":
                        System.out.println("Введите новое название заметки");
                        while (true) {
                            input = scanner.nextLine();
                            if (input.replaceAll(" ", "").equals("")) {
                                System.out.println("Поле не должно быть пустым");
                            } else {
                                break;
                            }
                        }
                        notes[noteSearchNumber - 1].noteName = input;
                        System.out.println("\nЗаметка изменена.\n\n" + notes[noteSearchNumber - 1] + "\nДля продолжения Нажмите на любую кнопку.");
                        scanner.nextLine();
                        break;

                    case "2":
                        System.out.println("Введите слово заметки, которое хотите заменить");
                        while (true) {
                            input = scanner.nextLine();
                            if (input.replaceAll(" ", "").equals("")) {
                                System.out.println("Поле не должно быть пустым");
                            } else if (notes[noteSearchNumber - 1].noteBody.contains(input)) {
                                System.out.println("Введите слово, на которое произвести замену");
                                notes[noteSearchNumber - 1].noteBody = notes[noteSearchNumber - 1].noteBody.replaceFirst(input, scanner.nextLine());
                                break;
                            } else {
                                System.out.println("Данное слово не существует в данной заметке. Введите корректное.");
                            }
                        }

                        System.out.println("\nЗаметка изменена.\n\n" + notes[noteSearchNumber - 1] + "\nДля продолжения Нажмите на любую кнопку.");
                        scanner.nextLine();
                        break;

                    case "3":
                        System.out.println("Введите новое тело заметки");
                        while (true) {
                            input = scanner.nextLine();
                            if (input.replaceAll(" ", "").equals("")) {
                                System.out.println("Поле не должно быть пустым");
                            } else {
                                break;
                            }
                        }
                        notes[noteSearchNumber - 1].noteBody = input;
                        System.out.println("\nЗаметка изменена.\n\n" + notes[noteSearchNumber - 1] + "\nДля продолжения Нажмите на любую кнопку.");
                        scanner.nextLine();
                        break;

                    case "4":
                        System.out.println(notes[noteSearchNumber - 1].noteAuthor);
                        System.out.println("\nДля продолжения Нажмите на любую кнопку");
                        scanner.nextLine();
                        break;

                    case "5":
                        notes[noteSearchNumber - 1] = null;
                        System.out.println("Заметка удалена.\nДля продолжения Нажмите на любую кнопку.");
                        scanner.nextLine();
                        break;

                    case "6":
                        return;

                    default:
                        System.out.println("Недопустимый ввод!\nВведите корректное значение.\n");
                }
            }
        } else {
            System.out.println("1. Вывести автора заметки");
            System.out.println("2. Назад");
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println(notes[noteSearchNumber - 1].noteAuthor);
                    System.out.println("\nДля продолжения Нажмите на любую кнопку");
                    scanner.nextLine();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.\n");
            }
        }
    }

    public void createdNotesByHardCode() {

        Notes note;

        note = new Notes("Заметка",
                "Тело заметки",
                "Тип заметки",
                noteNumber,
                "Кто-то кто-тович");
        notes[noteNumber - 1] = note;
        noteNumber ++;

        note = new Notes("Выделение ресурсов",
                "Выделение ресурсов на возделывание земли завершено",
                "Рабочая заметка",
                noteNumber,
                "Вильям Залусский");

        notes[noteNumber - 1] = note;
        noteNumber ++;
    }



    public void actionMenu() {

        System.out.println("Выберите пункт меню:");

        if (currentUser.equals(Users.Administrator) | currentUser.equals(Users.Moderator)) {
            System.out.println("1. Создание новой заметки");
            System.out.println("2. Поиск заметок");
            System.out.println("3. Разлогиниться");

            switch (scanner.nextLine()) {
                case "1":
                    createNote();
                    return;
                case "2":
                    searchNote();
                    return;
                case "3":
                    currentUser = null;
                    break;
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.\n");
            }
        } else {
            System.out.println("1. Поиск заметок");
            System.out.println("2. Разлогиниться");

            switch (scanner.nextLine()) {
                case "1":
                    searchNote();
                    return;
                case "2":
                    currentUser = null;
                    break;
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.\n");
            }
        }
    }
}
